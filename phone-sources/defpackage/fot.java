package defpackage;

import android.text.TextUtils;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class fot implements fpg {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ fot(fph fphVar, eaq eaqVar, int i) {
        this.c = i;
        this.b = fphVar;
        this.a = eaqVar;
    }

    @Override // defpackage.fpg
    public final void a(fnw fnwVar) {
        if (this.c != 0) {
            foo fooVar = ((fph) this.b).b;
            if (fooVar.q.as() == null) {
                return;
            }
            fooVar.z(fnwVar);
            return;
        }
        String str = ((frs) this.b).a;
        if (TextUtils.isEmpty(str)) {
            edb.e("MediaSessionLegacyStub", "onRemoveQueueItem(): Media ID shouldn't be null");
            return;
        }
        fqt fqtVar = ((fph) this.a).b.q;
        if (!fqtVar.q(17)) {
            edb.e("MediaSessionLegacyStub", "Can't remove item by ID without COMMAND_GET_TIMELINE being available");
            return;
        }
        eay eayVarN = fqtVar.N();
        eax eaxVar = new eax();
        for (int i = 0; i < eayVarN.c(); i++) {
            if (TextUtils.equals(eayVarN.p(i, eaxVar).q.b, str)) {
                fqtVar.az(i);
                return;
            }
        }
    }

    public /* synthetic */ fot(fph fphVar, frs frsVar, int i) {
        this.c = i;
        this.a = fphVar;
        this.b = frsVar;
    }
}
