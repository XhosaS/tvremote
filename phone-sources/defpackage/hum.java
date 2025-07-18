package defpackage;

import com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc;
import com.google.android.libraries.onegoogle.accountmenu.SelectedAccountDisc;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hum implements Runnable {
    final /* synthetic */ boolean a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public hum(Object obj, boolean z, int i) {
        this.c = i;
        this.a = z;
        this.b = obj;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [htv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v7, types: [els, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object, yjv] */
    @Override // java.lang.Runnable
    public final void run() {
        int i = this.c;
        if (i == 0) {
            hwp.g();
            boolean z = this.a;
            mma mmaVar = ((hun) this.b).a;
            boolean z2 = mmaVar.a;
            mmaVar.a = z;
            if (z2 != z) {
                mmaVar.d.a(z);
                return;
            }
            return;
        }
        if (i == 1) {
            String str = edt.a;
            ((dwi) this.b).a.h(this.a);
            return;
        }
        if (i == 2) {
            this.b.a(Boolean.valueOf(this.a));
            return;
        }
        if (i != 3) {
            if (this.a) {
                xwo xwoVar = ((xwl) this.b).a;
                xwoVar.o = true;
                if (xwoVar.k > 0) {
                    ttl ttlVar = xwoVar.n;
                    ttlVar.d();
                    ttlVar.e();
                }
            }
            ((xwl) this.b).a.p = false;
            return;
        }
        qwb qwbVar = (qwb) this.b;
        SelectedAccountDisc selectedAccountDisc = qwbVar.b;
        AccountParticleDisc accountParticleDisc = selectedAccountDisc.b;
        accountParticleDisc.setVisibility(0);
        selectedAccountDisc.a.setVisibility(8);
        accountParticleDisc.getClass();
        selectedAccountDisc.post(new pqi(accountParticleDisc, 15));
        qwbVar.b();
    }

    public /* synthetic */ hum(Object obj, boolean z, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = z;
    }

    public /* synthetic */ hum(qwb qwbVar, boolean z, int i) {
        this.c = i;
        this.b = qwbVar;
        this.a = false;
    }
}
