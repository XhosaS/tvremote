package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gr extends gp {
    final /* synthetic */ gt a;
    final /* synthetic */ String b;
    final /* synthetic */ gx c;

    public gr(gt gtVar, String str, gx gxVar) {
        this.a = gtVar;
        this.b = str;
        this.c = gxVar;
    }

    @Override // defpackage.gp
    public final void a() {
        throw null;
    }

    @Override // defpackage.gp
    public final void b(Object obj) throws Exception {
        gt gtVar = this.a;
        Map map = gtVar.b;
        gx gxVar = this.c;
        String str = this.b;
        Object obj2 = map.get(str);
        if (obj2 == null) {
            throw new IllegalStateException("Attempting to launch an unregistered ActivityResultLauncher with contract " + gxVar + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().");
        }
        int iIntValue = ((Number) obj2).intValue();
        gtVar.c.add(str);
        try {
            gtVar.g(iIntValue, gxVar, obj);
        } catch (Exception e) {
            this.a.c.remove(this.b);
            throw e;
        }
    }
}
