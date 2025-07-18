package defpackage;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ohj extends aarx {
    private static final Charset b = StandardCharsets.UTF_8;
    private static final aarx c = new aarz();
    private final oco d;

    public ohj(oco ocoVar) {
        this.d = ocoVar;
    }

    @Override // defpackage.aarx
    public final int a(CharSequence charSequence) {
        try {
            return aarz.e(charSequence);
        } catch (IllegalArgumentException e) {
            this.d.d(acsw.LOG_TYPE_INVALID_FIELD, oal.A, e, "Failed to encode UTF-8 string length", new Object[0]);
            return 0;
        }
    }

    @Override // defpackage.aarx
    public final String b(ByteBuffer byteBuffer, int i, int i2) {
        try {
            return byteBuffer.hasArray() ? new String(byteBuffer.array(), byteBuffer.arrayOffset() + i, i2, b) : c.b(byteBuffer, i, i2);
        } catch (IllegalArgumentException e) {
            this.d.d(acsw.LOG_TYPE_INVALID_FIELD, oal.A, e, "Failed to decode UTF-8 string", new Object[0]);
            return "";
        }
    }

    @Override // defpackage.aarx
    public final void c(CharSequence charSequence, ByteBuffer byteBuffer) {
        try {
            c.c(charSequence, byteBuffer);
        } catch (IllegalArgumentException e) {
            this.d.d(acsw.LOG_TYPE_INVALID_FIELD, oal.A, e, "Failed to encode UTF-8 string", new Object[0]);
        }
    }
}
