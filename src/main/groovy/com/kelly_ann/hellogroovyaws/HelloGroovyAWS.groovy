// Source: https://medium.com/@benorama/how-to-build-a-microservice-with-aws-lambda-in-groovy-4f7384c3b804#.c7fxtlwb5

package com.kelly_ann.hellogroovyaws

import com.amazonaws.services.lambda.runtime.Context

class HelloGroovyAWS {
	// the Lambda function handler
	Map handler(data, Context ctx) {
		ctx.logger.log "Received in Groovy: $data"
		[greeting: "Hello ${data?.firstName} ${data?.lastName}".toString()]
	}
}
