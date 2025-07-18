package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jda extends agtu implements agvb {
    int a;
    final /* synthetic */ jdb b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jda(jdb jdbVar, agsw agswVar) {
        super(2, agswVar);
        this.b = jdbVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((jda) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agtg agtgVar = agtg.a;
        try {
            if (this.a != 0) {
                agpl.b(obj);
            } else {
                agpl.b(obj);
                jcz jczVar = jcz.a;
                this.a = 1;
                obj = this.b.a.c(jcx.a, new String[0], jczVar, this);
                if (obj == agtgVar) {
                    return agtgVar;
                }
            }
            return (List) obj;
        } catch (vsq unused) {
            return agrd.a;
        }
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new jda(this.b, agswVar);
    }
}
