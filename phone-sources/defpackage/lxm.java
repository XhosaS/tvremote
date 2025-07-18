package defpackage;

import com.google.common.collect.ImmutableList;
import java.util.Collection;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lxm implements idf {
    private final yfo a;
    private final idf b;
    private lym c;

    public lxm(lxp lxpVar, yfo yfoVar) {
        this.a = yfoVar;
        this.b = lxpVar.e(kst.class);
    }

    public final synchronized ids a() {
        if (this.c == null) {
            this.c = (lym) this.a.b();
        }
        return this.c;
    }

    @Override // defpackage.idf
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final synchronized ieg b(ksy ksyVar) {
        lym lymVar = this.c;
        if (lymVar == null) {
            return ieg.a;
        }
        return lymVar.b(ksyVar);
    }

    public final /* synthetic */ ieg d(ksy ksyVar) {
        ImmutableList immutableListE = e(ImmutableList.of(ksyVar));
        return immutableListE.isEmpty() ? ieg.a : ieg.f((kst) immutableListE.get(0));
    }

    public final ImmutableList e(ImmutableList immutableList) {
        return ImmutableList.copyOf((Collection) this.b.b(immutableList));
    }
}
