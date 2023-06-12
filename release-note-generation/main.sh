#!/bin/bash

rm -rf /tmp/commit_log

set -e

last_release_tag=$LAST_RELEASE_TAG
if [ -z "${last_release_tag}" ]; then
  last_release_tag=$(git describe --tags $(git rev-list --tags --max-count=1))
fi

commit_log_files=""
mkdir /tmp/commit_log

echo "Checking commits since ${last_release_tag}"

for H in $(git log "${last_release_tag}..HEAD" --pretty=format:"%H"); do
  file=/tmp/commit_log/${H}.txt
  git log -1 "${H}" --pretty=format:"%B" > $file
  commit_log_files+=" $file"
done

echo "Commit message files: ${commit_log_files}"

for pom_file in $(ls java-*/pom.xml); do
  export MODULE=$(dirname "${pom_file}")
  echo "Checking entries for ${MODULE}"
  entry=$(release-note-generation/generate_release_entry.sh ${commit_log_files})
  echo "${entry}"
done
