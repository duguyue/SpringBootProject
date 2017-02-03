package org.lindl.filter;

import org.lindl.conf.CustomTagRuleBundle;
import org.sitemesh.builder.SiteMeshFilterBuilder;
import org.sitemesh.config.ConfigurableSiteMeshFilter;

/**
 * Created by lin on 2017/2/2.
 */
public class WebSiteMeshFilter extends ConfigurableSiteMeshFilter{
    @Override
    protected void applyCustomConfiguration(SiteMeshFilterBuilder builder) {
//        super.applyCustomConfiguration(builder);


        builder.addDecoratorPath("/*","/index")
                .addExcludedPath("/index");

//        builder.clearTagRuleBundles();
        builder.addTagRuleBundle(new CustomTagRuleBundle());

//        builder.addDecoratorPath("/templates/*","/templates/index.html")
//                .addExcludedPath("/templates/index.html");

        /*
        builder.addDecoratorPath("/template/*","classpath:/template/index")
                .addExcludedPath("classpath:/template/index")
                .addExcludedPath("classpath:/css/*")
                .addExcludedPath("classpath:/images/*");
         */
    }
}
