package itu.etu001844.humanresource.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.graphql.execution.RuntimeWiringConfigurer;

import graphql.Scalars;
import graphql.scalars.ExtendedScalars;
import graphql.schema.GraphQLScalarType;

@Configuration
public class GraphQlConfig {
    @Bean
    public RuntimeWiringConfigurer runtimeWiringConfigurer() {
        GraphQLScalarType address = ExtendedScalars
                .newAliasedScalar("Address")
                .aliasedScalar(Scalars.GraphQLString)
                .build();
        return wiringBuilder -> wiringBuilder.scalar(ExtendedScalars.Date).scalar(ExtendedScalars.UUID).scalar(address);
    }
}
