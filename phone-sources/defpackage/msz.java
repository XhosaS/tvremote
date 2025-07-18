package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.apps.play.movies.mobile.view.ui.DebugFlowLayoutManager;
import com.google.android.videos.R;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class msz extends FrameLayout implements msx {
    public final lfn a;
    public final RecyclerView b;
    public final mth c;
    public final mtm d;
    public final mcy e;
    public final ieg f;
    public final iea g;
    public final RecyclerView h;
    public final san i;
    public final idy j;
    public boolean k;
    public kri l;
    public int m;
    public gag n;
    private int o;

    public msz(lfn lfnVar, Executor executor, mcy mcyVar, iea ieaVar, ldv ldvVar, idf idfVar, san sanVar, Context context, idy idyVar, rzy rzyVar) {
        super(context, null, 0);
        this.m = 0;
        this.a = lfnVar;
        this.e = mcyVar;
        this.g = ieaVar;
        this.i = sanVar;
        this.j = idyVar;
        this.f = ldvVar.a();
        LayoutInflater.from(context).inflate(R.layout.knowledge_overlay_content_cast, this);
        setVisibility(8);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.entities_view);
        this.b = recyclerView;
        mtm mtmVar = new mtm(context, idfVar, executor, sanVar, rzyVar);
        this.d = mtmVar;
        mtmVar.g = this;
        mtmVar.registerAdapterDataObserver(new msy(this));
        recyclerView.setLayoutManager(new DebugFlowLayoutManager("IntKnowledgeOverCast"));
        recyclerView.setAdapter(mtmVar);
        recyclerView.setClipToPadding(false);
        this.c = new mth(mtmVar);
        this.h = (RecyclerView) findViewById(R.id.actor_view);
        this.o = 0;
        setClipChildren(false);
        setClipToPadding(false);
        setMeasureAllChildren(true);
        e();
    }

    @Override // defpackage.mgf
    public final void a(boolean z) {
        if (this.k || this.m != 2) {
            return;
        }
        mex.b(this.b, true != z ? 8 : 0);
    }

    @Override // defpackage.mgf
    public final boolean b() {
        throw null;
    }

    @Override // defpackage.mgf
    public final void c() {
        if (this.m == 2) {
            mth mthVar = this.c;
            if (mthVar.f == 1) {
                mthVar.a.removeMessages(0);
                mthVar.f = 2;
            }
        }
    }

    @Override // defpackage.mrh
    public final boolean d() {
        boolean z = this.k;
        f();
        return z;
    }

    public final void e() {
        f();
        if (this.m == 2) {
            this.c.a();
        }
    }

    public final void f() {
        if (this.k) {
            this.h.setVisibility(8);
            this.b.setVisibility(0);
            g(false);
        }
        kri kriVar = this.l;
        if (kriVar != null) {
            kriVar.b();
            this.l = null;
        }
        this.k = false;
    }

    public final void g(boolean z) {
        this.n.m(z);
    }

    @Override // defpackage.mga
    public final mfz generateLayoutParams() {
        return new mfz(-1, -1, true);
    }

    @Override // defpackage.mga
    public final boolean isAvodOverlay() {
        return false;
    }

    @Override // android.view.View
    protected final void onConfigurationChanged(Configuration configuration) throws Resources.NotFoundException {
        if (this.m != 2 || this.o == configuration.orientation) {
            return;
        }
        int dimensionPixelOffset = getContext().getResources().getDimensionPixelOffset(R.dimen.second_screen_entities_view_padding_bottom);
        int dimensionPixelOffset2 = getContext().getResources().getDimensionPixelOffset(R.dimen.second_screen_entities_view_padding_horizontal);
        RecyclerView recyclerView = this.b;
        recyclerView.setPadding(dimensionPixelOffset2, recyclerView.getPaddingTop(), dimensionPixelOffset2, dimensionPixelOffset);
        this.o = configuration.orientation;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // defpackage.mga
    public final View getView() {
        return this;
    }

    @Override // defpackage.mga
    public final /* synthetic */ void hideFeedbackText(boolean z) {
    }
}
