def componentsList() {
    return 'Component1,Component2,Component3,Component4,Component5'
}

pipeline {
    agent any
    
    parameters {
        choice(
            name: 'FUNCTION', 
            choices: ['Tag-Deployed-Commit', 'Tag-Latest-Commit', 'Delete-Tags'], 
            description: 'Select the function: Tag-Branches/Delete-Tags'
        )
        choice(
            name: 'ENVIRONMENT', 
            choices: ['qa', 'dev', 'stag', 'prod'], 
            description: 'This parameter is required to fetch the deployment SHA for Tag-Deployed-Commit function only'
        )
        string(
            name: 'TAGGING_BRANCH', 
            defaultValue: 'develop', 
            description: 'This parameter is required to fetch the latest commit of a branch for Tag-Latest-Commit function only'
        )
        string(
            name: 'TAG', 
            defaultValue: 'v2021.05.25.263', 
            description: 'Put Git tag name'
        )
        string(
            name: 'RELEASE_VERSION', 
            defaultValue: 'SS | V2021.05.25', 
            description: 'Put your Release version'
        )
        extendedChoice(
            description: '',
            multiSelectDelimiter: ',',
            name: 'COMPONENTS',
            quoteValue: false,
            saveJSONParameterToFile: false,
            type: 'PT_CHECKBOX',
            value: componentsList(),
            visibleItemCount: 5)
    }
    
    stages {
        stage('Git-Tagging') {
            steps {
                script {
                    echo "calling git tag pieline"
                    
                }
            }
        }
        stage('Validate-Deployments') {
            steps {
                script {
                    echo "calling git tag pieline"
                    
                }
            }
        }
        stage('Create-Git-Branches') {
            steps {
                script {
                    echo "calling git tag pieline"
                    
                }
            }
        }
        stage('Create-Git-PRs') {
            steps {
                script {
                    echo "calling git tag pieline"
                    
                }
            }
        }
    }
}
