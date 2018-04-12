# Chatbot Recommendation Engine

##### Two main components type explored with different algorithms,

            1. UserBased Recommendation Engine
                -PearsonCorrelationSimilarity
                -LogLikelihoodSimilarity
                -TanimotoCoefficientSimilarity
                -EuclideanDistanceSimilarity
                -GenericUserSimilarity
                -SpearmanCorrelationSimilarity
            2. ItemBased Recommendation Engine
                -PearsonCorrelationSimilarity
                -LogLikelihoodSimilarity
                -TanimotoCoefficientSimilarity
                -EuclideanDistanceSimilarity
                
             Evaluated the results with RMSE, F1, Precision and Recall
     
            
##### The REST API is written with Spring
            
            Endpoint 1:[GET] /getItemBasedRecommendations
            eg:
                http://localhost:8090/getItemBasedRecommendations?userId=200&numberOfRecommendation=6
                
                output:
                [{"itemID":1,"value":3.5782933},
                {"itemID":19,"value":3.5644608},
                {"itemID":13,"value":3.5610337},
                {"itemID":4,"value":3.5541322},
                {"itemID":17,"value":3.5536952},
                {"itemID":18,"value":3.5515275}]
            
            
            
            Endpoint 2: [POST] /updateUserData
            eg:
                http://localhost:8090/updateUserData     body: {"userId": "200","itemId": "9","ratings": "5"}
                
                
 ##### Technology
            1. Postgrace for loading data
            2. Apache.Mahout for recommendations
            3. Java Spring Boot for REST api
 
The spring application is running on port 8090 by default.
 