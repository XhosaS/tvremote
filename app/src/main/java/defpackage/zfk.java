package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class zfk extends zip implements zil {
    public final Object[] a;
    public final StringBuilder b;
    public int c;

    protected zfk(zgu zguVar, Object[] objArr, StringBuilder sb) {
        super(zguVar);
        this.c = 0;
        this.a = objArr;
        this.b = sb;
    }

    public static void a(StringBuilder sb, Object obj, String str) {
        String strA;
        sb.append("[INVALID: format=");
        sb.append(str);
        sb.append(", type=");
        sb.append(obj.getClass().getCanonicalName());
        sb.append(", value=");
        try {
            strA = zfv.b(obj);
        } catch (RuntimeException e) {
            strA = zfv.a(obj, e);
        }
        sb.append(strA);
        sb.append("]");
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x015e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void c(defpackage.zfp r20, java.lang.StringBuilder r21) {
        /*
            Method dump skipped, instructions count: 728
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zfk.c(zfp, java.lang.StringBuilder):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0094  */
    @Override // defpackage.zil
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(java.lang.Object r8, defpackage.zfl r9, defpackage.zfm r10) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 452
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zfk.b(java.lang.Object, zfl, zfm):void");
    }
}
