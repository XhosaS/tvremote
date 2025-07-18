package defpackage;

import android.app.Activity;
import android.content.Context;
import com.google.android.katniss.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uau {
    public static final zdy a = zdy.h("com/google/android/libraries/speech/transcription/ui/TranscriptionInitializationFragmentPeer");
    public final uat b;
    public final Activity c;
    public final Context d;
    private final tuy e;

    public uau(Activity activity, Context context, uat uatVar, tuy tuyVar) {
        this.c = activity;
        this.d = context;
        this.b = uatVar;
        this.e = tuyVar;
    }

    public final void a() {
        ab abVar = new ab(this.b.eg());
        abVar.q(R.id.transcription_fragment_container, uam.aC(this.e.a()), "transcriptionFragment");
        abVar.e();
    }
}
