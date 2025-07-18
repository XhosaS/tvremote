package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class yce extends abww implements abyr {
    public yce() {
        super(ycq.c);
    }

    public final void a(ycm ycmVar) {
        if ((this.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            y();
        }
        ycq ycqVar = (ycq) this.b;
        abxk abxkVar = ycq.a;
        abxs abxsVar = ycqVar.w;
        if (!abxsVar.c()) {
            int size = abxsVar.size();
            ycqVar.w = abxsVar.d(size + size);
        }
        ycqVar.w.add(ycmVar);
    }
}
