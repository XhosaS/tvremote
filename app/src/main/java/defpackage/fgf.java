package defpackage;

import android.content.ContentValues;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fgf extends agtu implements agvb {
    int a;
    final /* synthetic */ fgl b;
    final /* synthetic */ hvg c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fgf(fgl fglVar, hvg hvgVar, agsw agswVar) {
        super(2, agswVar);
        this.b = fglVar;
        this.c = hvgVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((fgf) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agtg agtgVar = agtg.a;
        int i = this.a;
        agpl.b(obj);
        if (i == 0) {
            fgl fglVar = this.b;
            final hvg hvgVar = this.c;
            zyd zydVarC = fglVar.D.a.c(new uqj() { // from class: hvd
                @Override // defpackage.uqj
                public final Object a(uqk uqkVar) throws InterruptedException {
                    ContentValues contentValues = new ContentValues();
                    hvg hvgVar2 = hvgVar;
                    contentValues.put("search_term", hvgVar2.a);
                    contentValues.put("assistant_visual_element", hvgVar2.d);
                    contentValues.put("image_primary_entity_mid", hvgVar2.e);
                    contentValues.put("event_id", hvgVar2.c);
                    contentValues.put("account_name", hvgVar2.b);
                    contentValues.put("timestamp_ms", hvgVar2.f.toString());
                    uqk.b();
                    wvx wvxVarF = wzg.f("INSERT WITH ON CONFLICT recent_search", wwb.a, true);
                    try {
                        uqkVar.b.insertWithOnConflict("recent_search", null, contentValues, 0);
                        wvxVarF.close();
                        return null;
                    } catch (Throwable th) {
                        try {
                            wvxVarF.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
            });
            zydVarC.getClass();
            this.a = 1;
            if (ahkr.b(zydVarC, this) == agtgVar) {
                return agtgVar;
            }
        }
        fgc fgcVar = fgl.a;
        return agpu.a;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new fgf(this.b, this.c, agswVar);
    }
}
