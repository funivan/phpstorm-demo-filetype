package org.funivan.phpstorm.demo.FileType;

import com.intellij.openapi.fileTypes.ExtensionFileNameMatcher;
import com.intellij.openapi.fileTypes.FileTypeConsumer;
import com.intellij.openapi.fileTypes.FileTypeFactory;
import com.jetbrains.php.lang.PhpFileType;
import org.jetbrains.annotations.NotNull;

/**
 * Created by funivan  on 11/25/14.
 */
public class FileType extends FileTypeFactory {

    /**
     * Assigns file types with languages.
     *
     * @param consumer file types consumer
     */
    @Override
    public void createFileTypes(@NotNull FileTypeConsumer consumer) {
        System.out.println("register items");
        consumer.consume(
                PhpFileType.INSTANCE,
                new ExtensionFileNameMatcher("html")
        );
    }

}
