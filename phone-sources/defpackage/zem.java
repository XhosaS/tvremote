package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zem implements yjk {
    final /* synthetic */ zeu a;
    private final zex b;

    public zem(zeu zeuVar, zex zexVar) {
        this.a = zeuVar;
        this.b = zexVar;
    }

    @Override // defpackage.yjk
    public final /* bridge */ /* synthetic */ Object a() throws IOException {
        zex zexVar;
        try {
            zexVar = this.b;
        } catch (IOException e) {
            this.a.k(2, 2, e);
            zex zexVar2 = this.b;
            byte[] bArr = zcr.a;
            a.af(zexVar2);
        } catch (Throwable th) {
            this.a.k(3, 3, null);
            zex zexVar3 = this.b;
            byte[] bArr2 = zcr.a;
            a.af(zexVar3);
            throw th;
        }
        if (!zexVar.a(true, this)) {
            throw new IOException("Required SETTINGS preface not received");
        }
        while (zexVar.a(false, this)) {
        }
        this.a.k(1, 9, null);
        byte[] bArr3 = zcr.a;
        a.af(zexVar);
        return ygi.a;
    }
}
