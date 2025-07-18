package defpackage;

import android.app.Activity;
import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import com.google.android.katniss.R;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uas {
    public static final zdy a = zdy.h("com/google/android/libraries/speech/transcription/ui/TranscriptionFragmentPeer");
    public final Activity b;
    public final txm c;
    public final vzc d;
    public final wxc e;
    public final tqu f;
    private final uam g;

    public uas(Activity activity, txm txmVar, vzc vzcVar, wxc wxcVar, tqu tquVar, uam uamVar) {
        this.b = activity;
        this.c = txmVar;
        this.d = vzcVar;
        this.e = wxcVar;
        this.f = tquVar;
        this.g = uamVar;
    }

    public final void a(tso tsoVar, Uri uri) {
        Intent intent = new Intent();
        intent.putStringArrayListExtra("android.speech.extra.RESULTS", new ArrayList<>(tsoVar.c));
        intent.putExtra("android.speech.extra.CONFIDENCE_SCORES", ztj.b(tsoVar.d));
        intent.putExtra("query", (String) tsoVar.c.get(0));
        if (!Objects.equals(uri, Uri.EMPTY)) {
            intent.setData(uri);
            intent.setFlags(1);
        }
        Activity activity = this.b;
        Intent intent2 = activity.getIntent();
        Bundle bundle = new Bundle();
        if (Build.VERSION.SDK_INT >= 34) {
            Bundle bundle2 = ActivityOptions.makeBasic().setPendingIntentBackgroundActivityStartMode(1).toBundle();
            bundle2.putAll(bundle);
            bundle = bundle2;
        }
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        PendingIntent pendingIntent = (PendingIntent) intent2.getParcelableExtra("android.speech.extra.RESULTS_PENDINGINTENT");
        if (pendingIntent == null) {
            activity.setResult(-1, intent);
            activity.finish();
            return;
        }
        Bundle bundleExtra = intent2.getBundleExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE");
        if (bundleExtra != null) {
            intent.putExtras(bundleExtra);
        }
        try {
            pendingIntent.send(activity, -1, intent);
        } catch (PendingIntent.CanceledException e) {
            ((zdv) ((zdv) ((zdv) a.c()).p(e)).q("com/google/android/libraries/speech/transcription/ui/TranscriptionFragmentPeer", "createResultIntent", 309, "TranscriptionFragmentPeer.java")).u("Not possible to start pending intent");
        } finally {
            this.b.finish();
        }
    }

    public final void b() {
        ab abVar = new ab(this.g.F.eg());
        String str = this.f.c;
        tqt tqtVar = new tqt();
        String string = UUID.randomUUID().toString();
        if ((tqtVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            tqtVar.y();
        }
        tqu tquVar = (tqu) tqtVar.b;
        string.getClass();
        tquVar.b |= 1;
        tquVar.c = string;
        if ((tqtVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            tqtVar.y();
        }
        tqu tquVar2 = (tqu) tqtVar.b;
        str.getClass();
        tquVar2.b |= 2;
        tquVar2.d = str;
        abVar.q(R.id.transcription_fragment_container, uam.aC((tqu) tqtVar.v()), "transcriptionFragment");
        abVar.e();
    }
}
