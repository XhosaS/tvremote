package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class jxj extends sfg implements xce {
    public xcd<Object> childFragmentInjector;

    @Override // defpackage.xce
    public xby<Object> androidInjector() {
        return getChildFragmentInjector();
    }

    public final xcd<Object> getChildFragmentInjector() {
        xcd<Object> xcdVar = this.childFragmentInjector;
        if (xcdVar != null) {
            return xcdVar;
        }
        yks.c("childFragmentInjector");
        return null;
    }

    @Override // defpackage.bl
    public int getTheme() {
        int i = true != shownAsCenteredDialog() ? R.attr.bottomSheetDialogTheme : R.attr.dialogTheme;
        TypedValue typedValue = new TypedValue();
        Context context = getContext();
        context.getClass();
        context.getTheme().resolveAttribute(i, typedValue, true);
        return typedValue.resourceId;
    }

    @Override // defpackage.bl, defpackage.bv
    public void onAttach(Context context) {
        context.getClass();
        wae.x(this);
        super.onAttach(context);
    }

    public abstract View onCreateDialogView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle);

    @Override // defpackage.sfg
    public final View onCreateReplayDialogView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return onCreateDialogView(layoutInflater, viewGroup, bundle);
    }

    public final void setChildFragmentInjector(xcd<Object> xcdVar) {
        xcdVar.getClass();
        this.childFragmentInjector = xcdVar;
    }
}
