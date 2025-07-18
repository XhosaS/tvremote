package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class uw extends ur {
    final /* synthetic */ ux a;
    final /* synthetic */ String b;
    final /* synthetic */ vb c;

    public uw(ux uxVar, String str, vb vbVar) {
        this.a = uxVar;
        this.b = str;
        this.c = vbVar;
    }

    @Override // defpackage.ur
    public final void a() {
        this.a.f(this.b);
    }

    @Override // defpackage.ur
    public final void b(Object obj) throws Exception {
        ux uxVar = this.a;
        Map map = uxVar.c;
        vb vbVar = this.c;
        String str = this.b;
        Object obj2 = map.get(str);
        if (obj2 == null) {
            throw new IllegalStateException(a.f(obj, vbVar, "Attempting to launch an unregistered ActivityResultLauncher with contract ", " and input ", ". You must ensure the ActivityResultLauncher is registered before calling launch()."));
        }
        int iIntValue = ((Number) obj2).intValue();
        uxVar.d.add(str);
        try {
            uxVar.a(iIntValue, vbVar, obj);
        } catch (Exception e) {
            ux uxVar2 = this.a;
            uxVar2.d.remove(this.b);
            throw e;
        }
    }
}
