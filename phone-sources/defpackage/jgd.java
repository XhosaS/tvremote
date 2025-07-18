package defpackage;

import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jgd extends sca {
    public RelativeLayout a;
    public TextView b;
    public TextView c;
    public View d;
    public int e = 4;

    public final View a() {
        View view = this.d;
        if (view != null) {
            return view;
        }
        yks.c("divider");
        return null;
    }

    public final TextView b() {
        TextView textView = this.c;
        if (textView != null) {
            return textView;
        }
        yks.c("annotation");
        return null;
    }

    @Override // defpackage.sca
    public final String g() {
        return "com.google.android.apps.googletv.app.presentation.components.dialoglistitem.DialogListItemViewBindable";
    }

    @Override // defpackage.sca
    public final void h() {
        try {
            this.a = (RelativeLayout) p(R.id.dialog_list_item_component);
            try {
                this.b = (TextView) p(R.id.title);
                try {
                    this.c = (TextView) p(R.id.annotation);
                    try {
                        this.d = p(R.id.divider);
                    } catch (scr unused) {
                        throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "divider", "com.google.android.apps.googletv.app.presentation.components.dialoglistitem.DialogListItemViewBindable"));
                    }
                } catch (scr unused2) {
                    throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "annotation", "com.google.android.apps.googletv.app.presentation.components.dialoglistitem.DialogListItemViewBindable"));
                }
            } catch (scr unused3) {
                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "title", "com.google.android.apps.googletv.app.presentation.components.dialoglistitem.DialogListItemViewBindable"));
            }
        } catch (scr unused4) {
            throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "dialog_list_item_component", "com.google.android.apps.googletv.app.presentation.components.dialoglistitem.DialogListItemViewBindable"));
        }
    }
}
