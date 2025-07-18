package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class osr implements ntm {
    private final osh a;
    private final osl b;

    protected osr(Context context, osl oslVar) {
        Context context2;
        context.getClass();
        Context applicationContext = context.getApplicationContext();
        oss ossVar = new oss();
        osg osgVar = new osg(null);
        osgVar.a();
        if (applicationContext == null) {
            throw new NullPointerException("Null context");
        }
        osgVar.a = applicationContext;
        osgVar.c = tst.i(ossVar);
        osgVar.a();
        if (osgVar.e == 1 && (context2 = osgVar.a) != null) {
            this.a = new osh(context2, osgVar.b, osgVar.c, osgVar.d);
            this.b = oslVar;
            return;
        }
        StringBuilder sb = new StringBuilder();
        if (osgVar.a == null) {
            sb.append(" context");
        }
        if (osgVar.e == 0) {
            sb.append(" googlerOverridesCheckbox");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public static ntm b(Context context, osf osfVar) {
        return new osr(context, new osl(osfVar));
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x0154 A[Catch: all -> 0x0172, TryCatch #1 {, blocks: (B:8:0x0020, B:10:0x0024, B:12:0x0033, B:14:0x003f, B:16:0x004c, B:74:0x015c, B:76:0x0160, B:77:0x0167, B:17:0x0053, B:19:0x005d, B:20:0x0061, B:22:0x0070, B:24:0x0075, B:34:0x00d1, B:70:0x0150, B:72:0x0154, B:36:0x00d7, B:37:0x00db, B:45:0x00ed, B:50:0x00f9, B:51:0x0103, B:53:0x010b, B:54:0x0110, B:56:0x0114, B:59:0x011a, B:61:0x0131, B:63:0x0135, B:65:0x013d, B:67:0x0145, B:69:0x014c, B:73:0x0157, B:79:0x0169, B:80:0x016c, B:44:0x00ea, B:81:0x016d, B:82:0x0170, B:25:0x008d, B:26:0x0092, B:27:0x0095, B:28:0x00aa, B:29:0x00b0, B:31:0x00b6, B:33:0x00c3, B:21:0x0067, B:43:0x00e3), top: B:107:0x0020, inners: #2, #4, #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0170 A[Catch: all -> 0x0172, DONT_GENERATE, TryCatch #1 {, blocks: (B:8:0x0020, B:10:0x0024, B:12:0x0033, B:14:0x003f, B:16:0x004c, B:74:0x015c, B:76:0x0160, B:77:0x0167, B:17:0x0053, B:19:0x005d, B:20:0x0061, B:22:0x0070, B:24:0x0075, B:34:0x00d1, B:70:0x0150, B:72:0x0154, B:36:0x00d7, B:37:0x00db, B:45:0x00ed, B:50:0x00f9, B:51:0x0103, B:53:0x010b, B:54:0x0110, B:56:0x0114, B:59:0x011a, B:61:0x0131, B:63:0x0135, B:65:0x013d, B:67:0x0145, B:69:0x014c, B:73:0x0157, B:79:0x0169, B:80:0x016c, B:44:0x00ea, B:81:0x016d, B:82:0x0170, B:25:0x008d, B:26:0x0092, B:27:0x0095, B:28:0x00aa, B:29:0x00b0, B:31:0x00b6, B:33:0x00c3, B:21:0x0067, B:43:0x00e3), top: B:107:0x0020, inners: #2, #4, #8 }] */
    @Override // defpackage.ntm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(defpackage.vsz r14) {
        /*
            Method dump skipped, instructions count: 439
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.osr.a(vsz):void");
    }

    public final String toString() {
        return "CollectionBasisLogVerifier{collectionBasisContext=" + this.a + ", basis=" + this.b + "}";
    }
}
