package com.luowei.maker.generator.main;

import cn.hutool.core.io.FileUtil;
import cn.hutool.core.io.resource.ClassPathResource;
import cn.hutool.core.util.StrUtil;
import com.luowei.maker.generator.JarGenerator;
import com.luowei.maker.generator.ScriptGenerator;
import com.luowei.maker.generator.file.DynamicFileGenerator;
import com.luowei.maker.meta.Meta;
import com.luowei.maker.meta.MetaManager;
import freemarker.template.TemplateException;

import java.io.File;
import java.io.IOException;

public class MainGenerator extends GenerateTemplate{

    @Override
    protected void buildDist(String outputPath, String sourceCopyDestPath, String jarPath, String shellOutputFilePath) {
        super.buildDist(outputPath, sourceCopyDestPath, jarPath, shellOutputFilePath);
    }
}