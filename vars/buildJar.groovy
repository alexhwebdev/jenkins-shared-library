#!/user/bin/env groovy

def call() {
    echo 'building the application...'
    sh 'mvn package'
}

// def call() {
//     echo "building the application for branch $GIT_BRANCH"
//     sh 'mvn package'
// }