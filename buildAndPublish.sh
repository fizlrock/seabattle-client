rm -rf output
openapi-generator generate --config generation_config.yml
cd output
gradle publishToMavenLocal
cd ..
