package defpackage;

import android.content.res.Resources;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class jyi implements yjz {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    private final /* synthetic */ int g;

    public /* synthetic */ jyi(bkp bkpVar, bkd bkdVar, boolean z, yka ykaVar, int i, int i2, int i3) {
        this.g = i3;
        this.e = bkpVar;
        this.d = bkdVar;
        this.b = z;
        this.f = ykaVar;
        this.a = i;
        this.c = i2;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [bkp, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [bkp, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [bkd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, yka] */
    @Override // defpackage.yjz
    public final Object a(Object obj, Object obj2) throws XmlPullParserException, Resources.NotFoundException, IOException {
        if (this.g != 0) {
            ((Integer) obj2).intValue();
            int iN = bdi.n(this.a | 1);
            int i = this.c;
            ?? r4 = this.f;
            boolean z = this.b;
            ?? r2 = this.d;
            wv.i(this.e, r2, z, r4, (bao) obj, iN, i);
            return ygi.a;
        }
        bao baoVar = (bao) obj;
        ((Integer) obj2).intValue();
        int i2 = this.c;
        boolean z2 = this.b;
        int i3 = this.a;
        Object obj3 = this.f;
        jxl.b(this.d, (String) this.e, (String) obj3, i3, z2, baoVar, bdi.n(i2 | 1));
        return ygi.a;
    }

    public /* synthetic */ jyi(bkp bkpVar, String str, String str2, int i, boolean z, int i2, int i3) {
        this.g = i3;
        this.d = bkpVar;
        this.e = str;
        this.f = str2;
        this.a = i;
        this.b = z;
        this.c = i2;
    }
}
