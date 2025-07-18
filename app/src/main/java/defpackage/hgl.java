package defpackage;

import android.content.Context;
import android.graphics.Picture;
import android.view.View;
import com.google.android.apps.tvsearch.results.activity.SearchResultActivity;
import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hgl extends agtu implements agvb {
    int a;
    final /* synthetic */ SearchResultActivity b;
    final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hgl(SearchResultActivity searchResultActivity, String str, agsw agswVar) {
        super(2, agswVar);
        this.b = searchResultActivity;
        this.c = str;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((hgl) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        View viewAl;
        agtg agtgVar = agtg.a;
        int i = this.a;
        agpl.b(obj);
        if (i == 0) {
            SearchResultActivity searchResultActivity = this.b;
            Duration durationOfMillis = Duration.ofMillis(searchResultActivity.getIntent().getLongExtra("screenshot_delay_time", hbt.a.toMillis()));
            durationOfMillis.getClass();
            if (searchResultActivity.getIntent().getBooleanExtra("preview_fullscreen", false)) {
                searchResultActivity.g();
                searchResultActivity.V = true;
            }
            this.a = 1;
            if (ahnx.a(durationOfMillis, this) == agtgVar) {
                return agtgVar;
            }
        }
        SearchResultActivity searchResultActivity2 = this.b;
        if (searchResultActivity2.B()) {
            viewAl = searchResultActivity2.Z();
        } else {
            if (!searchResultActivity2.aH()) {
                searchResultActivity2.setResult(1002);
                searchResultActivity2.finish();
                return agpu.a;
            }
            viewAl = searchResultActivity2.al();
        }
        hcc hccVarAj = searchResultActivity2.aj();
        Picture pictureA = searchResultActivity2.aj().a(viewAl);
        Context context = searchResultActivity2.p;
        zyg zygVar = null;
        if (context == null) {
            agvy.b("context");
            context = null;
        }
        String str = this.c;
        zyd zydVarC = hccVarAj.c(pictureA, context.getFilesDir(), str);
        hgk hgkVar = new hgk(searchResultActivity2, str);
        zyg zygVar2 = searchResultActivity2.E;
        if (zygVar2 == null) {
            agvy.b("lightweightExecutor");
        } else {
            zygVar = zygVar2;
        }
        zxn.p(zydVarC, wyo.f(hgkVar), zygVar);
        return agpu.a;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new hgl(this.b, this.c, agswVar);
    }
}
