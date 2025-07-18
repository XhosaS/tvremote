package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class mmo implements ieh {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ mmo(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [ieh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v15, types: [ieh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v18, types: [iea, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v31, types: [iea, java.lang.Object] */
    @Override // defpackage.ieh
    public final Object a() {
        switch (this.b) {
            case 0:
                return this.a;
            case 1:
                return ((bv) this.a).getView();
            case 2:
                return ((bv) this.a).getView();
            case 3:
                return ((bv) this.a).getActivity().getSupportFragmentManager();
            case 4:
                return new lif(413, (lio) this.a.a());
            case 5:
                return new lif(403, (lio) this.a.a());
            case 6:
                return (ieg) this.a.a();
            case 7:
                try {
                    ldv ldvVar = ((msr) this.a).a;
                    ieg iegVarA = ldvVar.a();
                    ldvVar.m(ldvVar.j(iegVarA));
                    return ieg.f(ldvVar.j(iegVarA));
                } catch (Exception e) {
                    return ieg.b(e);
                }
            case 8:
                return this.a;
            case 9:
                return this.a;
            case 10:
                return this.a;
            default:
                return ((List) this.a.a()).isEmpty() ? ieg.a : kvk.b;
        }
    }
}
