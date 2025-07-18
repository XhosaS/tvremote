package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.videos.R;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class jbk extends xch {
    public jaf a;
    private Toolbar b;
    private jbv c = jbv.a;
    private final View.OnClickListener d = new izk(this, 13);
    private final View.OnClickListener e = new izk(this, 14);

    private static final void b(View view, boolean z) {
        view.setVisibility(true != z ? 8 : 0);
    }

    public final jaf a() {
        jaf jafVar = this.a;
        if (jafVar != null) {
            return jafVar;
        }
        yks.c("veLogger");
        return null;
    }

    @Override // defpackage.xch, defpackage.bv
    public final void onAttach(Context context) {
        context.getClass();
        super.onAttach(context);
        jbv jbvVar = (jbv) requireArguments().getParcelable("player_error_data");
        if (jbvVar == null) {
            jbvVar = jbv.a;
        }
        this.c = jbvVar;
    }

    @Override // defpackage.bv
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.player_error_overlay, viewGroup, false);
        this.b = (Toolbar) viewInflate.findViewById(R.id.player_toolbar);
        View viewFindViewById = viewInflate.findViewById(R.id.error_text);
        if (viewFindViewById == null) {
            throw new IllegalStateException("Required value was null.");
        }
        TextView textView = (TextView) viewFindViewById;
        String string = this.c.b;
        if (string.length() == 0) {
            string = getString(R.string.error_generic);
            string.getClass();
        }
        textView.append(string);
        b(viewFindViewById, this.c.c);
        View viewFindViewById2 = viewInflate.findViewById(R.id.error_retry_button);
        if (viewFindViewById2 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        b(viewFindViewById2, this.c.d);
        viewFindViewById2.setOnClickListener(this.e);
        View viewFindViewById3 = viewInflate.findViewById(R.id.error_go_back_button);
        if (viewFindViewById3 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        b(viewFindViewById3, this.c.e);
        viewFindViewById3.setOnClickListener(this.d);
        View viewFindViewById4 = viewInflate.findViewById(R.id.error_troubleshoot_button);
        if (viewFindViewById4 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        b(viewFindViewById4, this.c.f);
        return viewInflate;
    }

    @Override // defpackage.bv
    public final void onDestroyView() {
        super.onDestroyView();
        jaf jafVarA = a();
        View viewRequireView = requireView();
        ImmutableList immutableListOf = ImmutableList.of();
        immutableListOf.getClass();
        jafVarA.g(viewRequireView, immutableListOf);
    }

    @Override // defpackage.bv
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        AppCompatActivity appCompatActivity = (AppCompatActivity) requireActivity();
        appCompatActivity.setSupportActionBar(this.b);
        ActionBar supportActionBar = appCompatActivity.getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.setDisplayHomeAsUpEnabled(true);
        }
        ActionBar supportActionBar2 = appCompatActivity.getSupportActionBar();
        if (supportActionBar2 != null) {
            supportActionBar2.setShowHideAnimationEnabled(false);
        }
        ActionBar supportActionBar3 = appCompatActivity.getSupportActionBar();
        if (supportActionBar3 != null) {
            supportActionBar3.setDisplayOptions(16);
        }
        ActionBar supportActionBar4 = appCompatActivity.getSupportActionBar();
        if (supportActionBar4 != null) {
            supportActionBar4.setDisplayShowCustomEnabled(true);
        }
        ActionBar supportActionBar5 = appCompatActivity.getSupportActionBar();
        if (supportActionBar5 != null) {
            supportActionBar5.setDisplayShowTitleEnabled(false);
        }
        View viewInflate = LayoutInflater.from(appCompatActivity).inflate(R.layout.action_bar_title, (ViewGroup) this.b, false);
        viewInflate.getClass();
        ((TextView) viewInflate.findViewById(R.id.title)).setText(this.c.g);
        viewInflate.findViewById(R.id.img_up_indicator).setOnClickListener(new izk(this, 11));
        b(viewInflate, true ^ requireActivity().isInPictureInPictureMode());
        ActionBar supportActionBar6 = appCompatActivity.getSupportActionBar();
        if (supportActionBar6 != null) {
            supportActionBar6.setCustomView(viewInflate);
        }
        view.setOnClickListener(new izk(this, 12));
        jbv jbvVar = this.c;
        if (jbvVar.h || yks.e(jbvVar.b, getString(R.string.no_network))) {
            return;
        }
        jaf jafVarA = a();
        jad jadVarE = jbr.E(265378, null);
        ImmutableMap immutableMapOf = ImmutableMap.of();
        immutableMapOf.getClass();
        jafVarA.a(view, jadVarE, immutableMapOf);
    }
}
