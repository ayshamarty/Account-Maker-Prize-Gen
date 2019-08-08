pipeline{
        agent any
        stages{
                stage('---build---'){
                        steps{
                               sh "docker build -t ayshamarty/account-prize-gen ."
                        }
                }
                stage('---push---'){
                        steps{
                                sh "docker push ayshamarty/account-prize-gen"
                        }
                }

                stage('---redeploy stack---') {
                    steps {
                            build job: "Account-API-Deploy", wait: true

                        }
                }
        }
}


