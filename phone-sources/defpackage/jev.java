package defpackage;

import android.view.View;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class jev implements sck {
    public final /* synthetic */ ixi a;
    public final /* synthetic */ sbx b;
    private final /* synthetic */ int c;

    public /* synthetic */ jev(sbx sbxVar, ixi ixiVar, int i) {
        this.c = i;
        this.b = sbxVar;
        this.a = ixiVar;
    }

    @Override // defpackage.sck
    public final void a(Object obj, View view) {
        switch (this.c) {
            case 0:
                view.getClass();
                ((jew) this.b).a.h(view, this.a, yhb.a);
                break;
            case 1:
                view.getClass();
                ((jep) this.b).a.h(view, this.a, yhb.a);
                break;
            case 2:
                ixi ixiVar = this.a;
                try {
                    jaf jafVar = ((jfj) this.b).a;
                    view.getClass();
                    jafVar.h(view, ixiVar, yfm.p(Integer.valueOf(R.id.channel_header_view)));
                    break;
                } catch (Exception e) {
                    krd.c("Unable unbind Component View for channel. ".concat(String.valueOf(e.getMessage())));
                    return;
                }
            case 3:
                view.getClass();
                ((jgb) this.b).a.h(view, this.a, yhb.a);
                break;
            case 4:
                view.getClass();
                ((jgg) this.b).a.h(view, this.a, yhb.a);
                break;
            case 5:
                view.getClass();
                ((jgm) this.b).a.h(view, this.a, yhb.a);
                break;
            case 6:
                view.getClass();
                ((jgv) this.b).b.h(view, this.a, yfm.s(Integer.valueOf(R.id.rent_cta_layout), Integer.valueOf(R.id.purchase_cta_layout), Integer.valueOf(R.id.local_button), Integer.valueOf(R.id.remote_button), Integer.valueOf(R.id.rent_provider_cta_layout), Integer.valueOf(R.id.purchase_provider_cta_layout), Integer.valueOf(R.id.cancel_preorder_cta_layout), Integer.valueOf(R.id.show_episodes_cta_layout), Integer.valueOf(R.id.more_providers_cta_layout), Integer.valueOf(R.id.my_episodes_cta_layout), Integer.valueOf(R.id.ai_overview_cta_layout)));
                break;
            case 7:
                view.getClass();
                ((jia) this.b).a.h(view, this.a, yhb.a);
                break;
            case 8:
                view.getClass();
                ((jir) this.b).a.h(view, this.a, yhb.a);
                break;
            case 9:
                view.getClass();
                ((jja) this.b).a.h(view, this.a, yhb.a);
                break;
            case 10:
                view.getClass();
                ((jji) this.b).a.h(view, this.a, yhb.a);
                break;
            case 11:
                view.getClass();
                ((jjw) this.b).a.h(view, this.a, yhb.a);
                break;
            case 12:
                view.getClass();
                ((jkc) this.b).a.h(view, this.a, yhb.a);
                break;
            case 13:
                view.getClass();
                ((jkj) this.b).a.h(view, this.a, yhb.a);
                break;
            case 14:
                view.getClass();
                ((jks) this.b).a.h(view, this.a, yfm.p(Integer.valueOf(R.id.cta)));
                break;
            case 15:
                view.getClass();
                ((jlb) this.b).a.h(view, this.a, yfm.p(Integer.valueOf(R.id.ai_quick_recap_button)));
                break;
            case 16:
                view.getClass();
                ((jlk) this.b).a.h(view, this.a, yhb.a);
                break;
            case 17:
                view.getClass();
                ((jmd) this.b).a.h(view, this.a, yhb.a);
                break;
            case 18:
                view.getClass();
                ((jmn) this.b).a.h(view, this.a, yhb.a);
                break;
            case 19:
                view.getClass();
                ((jna) this.b).a.h(view, this.a, yhb.a);
                break;
            default:
                view.getClass();
                ((jne) this.b).a.h(view, this.a, yhb.a);
                break;
        }
    }
}
