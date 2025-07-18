package defpackage;

import android.graphics.Color;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jfc extends sca {
    public static final int a = Color.parseColor("#e3e3e3");
    public static final int b = Color.parseColor("#303030");
    public ImageView c;
    public LinearLayout d;
    public ImageView e;
    public View f;
    public View g;
    public final kuw h;
    public final kuw i;

    public jfc() {
        throw null;
    }

    public final View a() {
        View view = this.f;
        if (view != null) {
            return view;
        }
        yks.c("channelHeaderArrowImageBc25");
        return null;
    }

    @Override // defpackage.sca
    public final String g() {
        return "com.google.android.apps.googletv.app.presentation.components.channel.ChannelHeaderViewBindable";
    }

    @Override // defpackage.sca
    public final void h() {
        try {
            this.c = (ImageView) p(R.id.channel_refresh_img);
            try {
                this.d = (LinearLayout) p(R.id.channel_header_info);
                try {
                    this.e = (ImageView) p(R.id.channel_header_arrow_img);
                    try {
                        this.f = p(R.id.channel_header_arrow_img_bc25);
                        try {
                            this.g = p(R.id.min_height_controller);
                        } catch (scr unused) {
                            throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "min_height_controller", "com.google.android.apps.googletv.app.presentation.components.channel.ChannelHeaderViewBindable"));
                        }
                    } catch (scr unused2) {
                        throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "channel_header_arrow_img_bc25", "com.google.android.apps.googletv.app.presentation.components.channel.ChannelHeaderViewBindable"));
                    }
                } catch (scr unused3) {
                    throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "channel_header_arrow_img", "com.google.android.apps.googletv.app.presentation.components.channel.ChannelHeaderViewBindable"));
                }
            } catch (scr unused4) {
                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "channel_header_info", "com.google.android.apps.googletv.app.presentation.components.channel.ChannelHeaderViewBindable"));
            }
        } catch (scr unused5) {
            throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "channel_refresh_img", "com.google.android.apps.googletv.app.presentation.components.channel.ChannelHeaderViewBindable"));
        }
    }

    public jfc(kuw kuwVar, kuw kuwVar2) {
        this.h = kuwVar;
        this.i = kuwVar2;
    }
}
