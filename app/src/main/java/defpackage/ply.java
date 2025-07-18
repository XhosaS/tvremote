package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ply {
    private final plx a;

    public ply(plx plxVar) {
        this.a = plxVar;
    }

    public final phb a(Throwable th, int i) {
        if (i >= 5) {
            return phb.UNKNOWN_ERROR;
        }
        phb phbVarA = this.a.a(th);
        phb phbVar = phb.UNKNOWN_ERROR;
        return !phbVarA.equals(phbVar) ? phbVarA : th instanceof phc ? ((phc) th).a : (!(th instanceof jvb) || ((jsx) ((jvb) th).a).b == -1) ? th.getCause() != null ? a(th.getCause(), i + 1) : th instanceof jtj ? phb.ANDROID_DOWNLOADER2_ERROR : phbVar : phb.ANDROID_DOWNLOADER_HTTP_ERROR;
    }
}
