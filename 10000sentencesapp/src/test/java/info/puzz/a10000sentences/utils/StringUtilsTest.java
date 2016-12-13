package info.puzz.a10000sentences.utils;

import junit.framework.Assert;

import org.apache.commons.lang3.*;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public final class StringUtilsTest {
    @Test
    public void testRomanianWithDash() {
        String sentence = "L-a trezit.";
        List<WordChunk> chunks = StringUtils.getWordChunks(sentence);
        Assert.assertEquals(2, chunks.size());
        Assert.assertEquals("L-a", chunks.get(0).word);
        Assert.assertEquals("trezit", chunks.get(1).word);
    }
}