package com.google.android.apps.play.movies.mobileux.screen.player.infocards.actors.profile;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.videos.R;
import com.google.common.collect.ImmutableList;
import defpackage.hjr;
import defpackage.hvc;
import defpackage.jwq;
import defpackage.jys;
import defpackage.mqw;
import defpackage.nbd;
import defpackage.nbo;
import defpackage.tst;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ActorProfileView extends FrameLayout implements nbo<nbd> {
    public jys a;
    private TextView b;
    private TextView c;
    private ImageView d;
    private ImageButton e;

    public ActorProfileView(Context context) {
        super(context);
    }

    @Override // defpackage.nbo
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final void a(nbd nbdVar) {
        Resources resources = getResources();
        this.b.setText(nbdVar.a);
        ImmutableList.Builder builder = ImmutableList.builder();
        builder.addAll((Iterable) nbdVar.b);
        tst tstVar = nbdVar.c;
        if (tstVar.g()) {
            builder.add((ImmutableList.Builder) tstVar.c());
        } else {
            tst tstVar2 = nbdVar.d;
            if (tstVar2.g()) {
                builder.add((ImmutableList.Builder) tstVar2.c());
            }
        }
        tst tstVar3 = nbdVar.e;
        if (tstVar3.g()) {
            builder.add((ImmutableList.Builder) tstVar3.c());
        }
        String strF = jwq.F(resources, true, builder.build());
        if (TextUtils.isEmpty(strF)) {
            this.c.setVisibility(4);
        } else {
            this.c.setVisibility(0);
            this.c.setText(strF);
        }
        tst tstVar4 = nbdVar.f;
        if (!tstVar4.g() || this.a == null) {
            this.d.setVisibility(4);
        } else {
            this.d.setVisibility(0);
            Context context = getContext();
            hjr.c(context).g((String) tstVar4.c()).h(hvc.a()).k(this.d);
        }
        this.e.setOnClickListener(new mqw(nbdVar, 17));
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ImageButton imageButton = this.e;
        if (imageButton != null) {
            jwq.W(imageButton);
        } else {
            sendAccessibilityEvent(8);
        }
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        this.b = (TextView) findViewById(R.id.name);
        this.c = (TextView) findViewById(R.id.roles_and_biography);
        this.d = (ImageView) findViewById(R.id.profile_image);
        this.e = (ImageButton) findViewById(R.id.close);
    }

    public ActorProfileView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ActorProfileView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
