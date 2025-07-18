package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qfm {
    public static final tvn a = tvn.n("GnpSdk");

    public static final /* synthetic */ vku a(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        try {
            vuc vucVarP = vuc.p(vku.a, bArr, 0, bArr.length, vtp.a());
            vuc.B(vucVarP);
            return (vku) vucVarP;
        } catch (vuq e) {
            ((tvk) ((tvk) a.f()).i(e)).s("Failed to parse AndroidPayload proto.");
            return null;
        }
    }
}
