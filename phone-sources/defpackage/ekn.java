package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class ekn implements ecw {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ ekn(ekl eklVar, Object obj, int i) {
        this.c = i;
        this.b = eklVar;
        this.a = obj;
    }

    @Override // defpackage.ecw
    public final void a(Object obj) {
        switch (this.c) {
            case 0:
                ((ekm) obj).b((ekl) this.a, (String) this.b);
                break;
            case 1:
                ((ekm) obj).u((ekl) this.b, (eai) this.a);
                break;
            case 2:
                ((ekm) obj).a((ekl) this.b, (dyo) this.a);
                break;
            case 3:
                ((ekm) obj).s((ekl) this.b, (ead) this.a);
                break;
            case 4:
                ((ekm) obj).G((ekl) this.b, (ebh) this.a);
                break;
            case 5:
                ((ekm) obj).I((ekl) this.a, (String) this.b);
                break;
            case 6:
                ((ekm) obj).i((ekl) this.a, (evv) this.b);
                break;
            case 7:
                ((ekm) obj).x((ekl) this.b, (eah) this.a);
                break;
            case 8:
                ((ekm) obj).n((ekl) this.a, (Exception) this.b);
                break;
            case 9:
                ((ekm) obj).Y((evq) this.a, (evv) this.b);
                break;
            case 10:
                ((ekm) obj).J((ekl) this.b, (ehw) this.a);
                break;
            case 11:
                ((ekm) obj).as((ekl) this.b, (dze) this.a);
                break;
            case 12:
                ((ekm) obj).e((ekl) this.a, (elt) this.b);
                break;
            case 13:
                ekm ekmVar = (ekm) obj;
                ebo eboVar = (ebo) this.a;
                ekmVar.L((ekl) this.b, eboVar);
                int i = eboVar.e;
                int i2 = eboVar.f;
                float f = eboVar.g;
                ekmVar.ao(i, i2);
                break;
            case 14:
                ((ekm) obj).ap((ekl) this.b, (dze) this.a);
                break;
            case 15:
                ((ekm) obj).ah((ekl) this.a, this.b);
                break;
            case 16:
                ((ekm) obj).H((ekl) this.a, (evv) this.b);
                break;
            default:
                ((ekm) obj).f((ekl) this.a, (elt) this.b);
                break;
        }
    }

    public /* synthetic */ ekn(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }
}
