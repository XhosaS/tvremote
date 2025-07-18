package defpackage;

import android.view.View;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class jsi implements scg {
    public final /* synthetic */ sbx a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ jsi(sbx sbxVar, Object obj, int i) {
        this.c = i;
        this.a = sbxVar;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v42, types: [ixh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [ixh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v10, types: [ixh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v11, types: [ixh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v12, types: [ixh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v18, types: [ixh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v19, types: [ixh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [ixh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v20, types: [ixh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v21, types: [ixh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v22, types: [ixh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3, types: [ixh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4, types: [ixh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [ixh, java.lang.Object] */
    @Override // defpackage.scg
    public final void a(Object obj, View view) {
        switch (this.c) {
            case 0:
                view.getClass();
                ((jsj) this.a).a.b(view, this.b, (kjh) obj, yhc.a);
                break;
            case 1:
                view.getClass();
                ((jsa) this.a).a.b(view, this.b, (jse) obj, yhc.a);
                break;
            case 2:
                view.getClass();
                ((jsl) this.a).a.b(view, this.b, (jsy) obj, yhc.a);
                break;
            case 3:
                view.getClass();
                ((jsq) this.a).a.a(view, jbr.D(161711, this.b, (jst) obj), yfm.f(new yfw(Integer.valueOf(R.id.banner_title_button), jbr.E(161712, null))));
                break;
            case 4:
                view.getClass();
                ((jsv) this.a).a.a(view, jbr.D(161859, this.b, (jsy) obj), yhc.a);
                break;
            case 5:
                view.getClass();
                ((jtu) this.a).a.b(view, this.b, (jtx) obj, yhc.a);
                break;
            case 6:
                view.getClass();
                ((juc) this.a).a.b(view, this.b, (jug) obj, yhc.a);
                break;
            case 7:
                view.getClass();
                ((juk) this.a).a.b(view, this.b, (juo) obj, yfm.f(new yfw(Integer.valueOf(R.id.setup_prompt_cta), 130100)));
                break;
            case 8:
                view.getClass();
                ((juq) this.a).a.b(view, this.b, (kjy) obj, yhc.a);
                break;
            case 9:
                view.getClass();
                ((juw) this.a).a.b(view, this.b, (jvb) obj, yhc.a);
                break;
            case 10:
                view.getClass();
                ((jve) this.a).a.b(view, this.b, (jvh) obj, yhc.a);
                break;
            case 11:
                view.getClass();
                ((jvk) this.a).a.b(view, this.b, (jvn) obj, yhc.a);
                break;
            case 12:
                view.getClass();
                ((jvq) this.a).a.b(view, this.b, (jvt) obj, yhc.a);
                break;
            case 13:
                view.getClass();
                ?? r0 = this.b;
                jad jadVarD = jbr.D(107517, r0, (jwe) obj);
                jvw jvwVar = (jvw) r0;
                ((jwa) this.a).a.a(view, jadVarD, yfm.h(new yfw(Integer.valueOf(R.id.watch_list_icon), new jad(139332, 0L, 0, null, null, null, 62)), new yfw(Integer.valueOf(R.id.play_icon), jbr.F(110071, "play-movies", jvwVar.h, jvwVar.i())), new yfw(Integer.valueOf(R.id.download_view), new jad(110070, 0L, 0, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 62))));
                break;
            case 14:
                view.getClass();
                kdo kdoVar = (kdo) this.b;
                wpm wpmVar = kdoVar.d;
                ((kdp) this.a).a.a(view, jbr.M(wpmVar, kdoVar.c, kdoVar.a, ihz.q(wpmVar), null, 16), yhc.a);
                break;
            default:
                Object obj2 = this.b;
                try {
                    Object obj3 = ((mps) this.a).a.b;
                    ((pke) obj3).b(true != ((mpj) obj2).c() ? 116439 : 116438).a(view.findViewById(R.id.view_mode));
                    ((pke) obj3).b(116440).a(view.findViewById(R.id.sort_option));
                    break;
                } catch (Exception e) {
                    krd.c("Error create view for Library sort section presenter ".concat(String.valueOf(e.getMessage())));
                    return;
                }
        }
    }
}
