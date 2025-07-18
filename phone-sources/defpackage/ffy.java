package defpackage;

import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.StandardCharsets;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ffy extends ffr {
    private static final Pattern a = Pattern.compile("(.+?)='(.*?)';", 32);
    private final CharsetDecoder b = StandardCharsets.UTF_8.newDecoder();
    private final CharsetDecoder c = StandardCharsets.ISO_8859_1.newDecoder();

    private final String c(ByteBuffer byteBuffer) {
        String string;
        try {
            return this.b.decode(byteBuffer).toString();
        } catch (CharacterCodingException unused) {
            try {
                string = this.c.decode(byteBuffer).toString();
            } catch (CharacterCodingException unused2) {
                string = null;
            } catch (Throwable th) {
                this.c.reset();
                byteBuffer.rewind();
                throw th;
            }
            this.c.reset();
            byteBuffer.rewind();
            return string;
        } finally {
            this.b.reset();
            byteBuffer.rewind();
        }
    }

    @Override // defpackage.ffr
    protected final ead b(ffq ffqVar, ByteBuffer byteBuffer) {
        String strC = c(byteBuffer);
        byte[] bArr = new byte[byteBuffer.limit()];
        byteBuffer.get(bArr);
        String str = null;
        if (strC == null) {
            return new ead(new fga(bArr, null, null));
        }
        Matcher matcher = a.matcher(strC);
        String str2 = null;
        for (int iEnd = 0; matcher.find(iEnd); iEnd = matcher.end()) {
            String strGroup = matcher.group(1);
            String strGroup2 = matcher.group(2);
            if (strGroup != null) {
                String strJ = sij.J(strGroup);
                int iHashCode = strJ.hashCode();
                if (iHashCode != -315603473) {
                    if (iHashCode == 1646559960 && strJ.equals("streamtitle")) {
                        str = strGroup2;
                    }
                } else if (strJ.equals("streamurl")) {
                    str2 = strGroup2;
                }
            }
        }
        return new ead(new fga(bArr, str, str2));
    }
}
