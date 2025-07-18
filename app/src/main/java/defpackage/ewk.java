package defpackage;

import android.content.Context;
import android.content.Intent;
import android.hardware.hdmi.HdmiDeviceInfo;
import android.media.tv.TvContract;
import android.media.tv.TvInputInfo;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ewk {
    public final CharSequence a;
    public final CharSequence b;
    public final HdmiDeviceInfo c;
    public ewk d;
    public final Intent e;
    public final Intent f;
    private final Uri g;

    public ewk(TvInputInfo tvInputInfo, Context context) {
        tvInputInfo.getClass();
        CharSequence charSequenceLoadLabel = tvInputInfo.loadLabel(context);
        charSequenceLoadLabel.getClass();
        this.a = charSequenceLoadLabel;
        this.b = tvInputInfo.loadCustomLabel(context);
        this.c = tvInputInfo.getHdmiDeviceInfo();
        Uri uriBuildChannelUriForPassthroughInput = TvContract.buildChannelUriForPassthroughInput(tvInputInfo.getId());
        uriBuildChannelUriForPassthroughInput.getClass();
        this.g = uriBuildChannelUriForPassthroughInput;
        Intent intent = new Intent("android.intent.action.VIEW", uriBuildChannelUriForPassthroughInput);
        intent.setFlags(268435456);
        this.e = intent;
        Intent intent2 = new Intent("android.intent.action.SCREEN_OFF", uriBuildChannelUriForPassthroughInput);
        intent2.setFlags(268435456);
        this.f = intent2;
    }
}
