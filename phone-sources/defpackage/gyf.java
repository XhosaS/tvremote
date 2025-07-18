package defpackage;

import android.net.Uri;
import java.nio.ByteBuffer;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gyf implements gyi {
    private final /* synthetic */ int a;
    private final Object b;
    private final Object c;

    public gyf(Object obj, gzy gzyVar, int i) {
        this.a = i;
        this.b = obj;
        this.c = gzyVar;
    }

    private static final void b(Uri uri) {
        Objects.toString(uri);
        throw new IllegalStateException("Invalid android.resource URI: ".concat(uri.toString()));
    }

    /* JADX WARN: Removed duplicated region for block: B:94:0x021f  */
    @Override // defpackage.gyi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(defpackage.yih r13) throws org.xmlpull.v1.XmlPullParserException, android.content.res.Resources.NotFoundException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 777
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gyf.a(yih):java.lang.Object");
    }

    public gyf(ByteBuffer byteBuffer, gzy gzyVar, int i) {
        this.a = i;
        this.c = byteBuffer;
        this.b = gzyVar;
    }
}
