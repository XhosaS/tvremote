package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.media3.exoplayer.ExoPlayer;
import com.google.android.apps.googletv.app.presentation.pages.entity.EntityPageActivity;
import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jbq extends BroadcastReceiver {
    public ovs a;
    public ovq b;

    public final ovs a() {
        ovs ovsVar = this.a;
        if (ovsVar != null) {
            return ovsVar;
        }
        yks.c("playerController");
        return null;
    }

    public final ovq b() {
        ovq ovqVar = this.b;
        if (ovqVar != null) {
            return ovqVar;
        }
        yks.c("trailerController");
        return null;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        intent.getClass();
        wae.B(this, context);
        String stringExtra = intent.getStringExtra("source_of_action");
        int intExtra = intent.getIntExtra("PIP_ACTION_EXTRA", 0);
        if (intExtra != 1) {
            if (intExtra == 2) {
                if (yks.e(stringExtra, "tvod_fragment")) {
                    a().L();
                    return;
                } else {
                    if (yks.e(stringExtra, EntityPageActivity.TRAILER_PLAYER_FRAGMENT_TAG)) {
                        b().a();
                        return;
                    }
                    return;
                }
            }
            if (intExtra != 3) {
                return;
            }
            if (yks.e(stringExtra, "tvod_fragment")) {
                a().M();
                return;
            } else {
                if (yks.e(stringExtra, EntityPageActivity.TRAILER_PLAYER_FRAGMENT_TAG)) {
                    b().b();
                    return;
                }
                return;
            }
        }
        if (yks.e(stringExtra, "tvod_fragment")) {
            Long lK = a().K();
            if (lK != null) {
                long jLongValue = lK.longValue() - 10000;
                ovs ovsVarA = a();
                Duration durationOfMillis = Duration.ofMillis(jLongValue > 0 ? jLongValue : 0L);
                durationOfMillis.getClass();
                ovsVarA.R(durationOfMillis);
                return;
            }
            return;
        }
        if (yks.e(stringExtra, EntityPageActivity.TRAILER_PLAYER_FRAGMENT_TAG)) {
            ovq ovqVarB = b();
            if (!ovqVarB.b) {
                throw new IllegalStateException("Please setup the controller first by calling Controller#setup().");
            }
            ExoPlayer exoPlayer = ovqVarB.a;
            Long lValueOf = exoPlayer != null ? Long.valueOf(exoPlayer.D()) : null;
            if (lValueOf != null) {
                long jLongValue2 = lValueOf.longValue() - 10000;
                ovq ovqVarB2 = b();
                long j = jLongValue2 > 0 ? jLongValue2 : 0L;
                ExoPlayer exoPlayer2 = ovqVarB2.a;
                if (exoPlayer2 == null) {
                    throw new IllegalStateException("ExoPlayer not setup. Call TrailerController#setup().");
                }
                exoPlayer2.i(j);
            }
        }
    }
}
