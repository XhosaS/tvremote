package defpackage;

import j$.util.DesugarCollections;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tnl implements tni {
    public final tmi a;
    private final ujk b;
    private final zyg c;

    public tnl(zyg zygVar, tmi tmiVar, ujk ujkVar) {
        this.c = zygVar;
        this.a = tmiVar;
        this.b = ujkVar;
    }

    @Override // defpackage.tni
    public final zyd a(final String str) {
        return zuz.g(this.b.c(), wyo.a(new yqi() { // from class: tnj
            @Override // defpackage.yqi
            public final Object apply(Object obj) {
                tnb tnbVar;
                for (Map.Entry entry : DesugarCollections.unmodifiableMap(((adfw) obj).b).entrySet()) {
                    String str2 = (String) entry.getKey();
                    str2.getClass();
                    List listT = agyv.t(str2, new String[]{"|"});
                    int size = listT.size();
                    if (size == 1) {
                        tnbVar = new tnb(addl.c((String) listT.get(0)), 0);
                    } else {
                        if (size != 2) {
                            throw new IllegalArgumentException("Unable to parse ClientKey: ".concat(str2));
                        }
                        tnbVar = new tnb(addl.c((String) listT.get(0)), Integer.parseInt((String) listT.get(1)));
                    }
                    tmi tmiVarA = this.a.a.a(tnbVar.a);
                    int i = tnbVar.b;
                    if (i > 0) {
                        tmiVarA = tmiVarA.d(new tmd(i, 6));
                    }
                    tmiVarA.g(str, ((adft) entry.getValue()).b.size());
                }
                return null;
            }
        }), this.c);
    }

    @Override // defpackage.tni
    public final zyd b() {
        return this.b.a(new yqi() { // from class: tnk
            @Override // defpackage.yqi
            public final Object apply(Object obj) {
                return adfw.a;
            }
        }, this.c);
    }
}
