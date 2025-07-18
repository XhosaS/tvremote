package defpackage;

import android.os.Message;
import android.view.View;
import android.widget.Button;

/* compiled from: PG */
/* loaded from: classes.dex */
class ft implements View.OnClickListener {
    final /* synthetic */ ga a;

    public ft(ga gaVar) {
        this.a = gaVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Message messageObtain;
        Message message;
        Message message2;
        ga gaVar = this.a;
        if (view == gaVar.i && (message2 = gaVar.k) != null) {
            messageObtain = Message.obtain(message2);
        } else if (view != gaVar.l || (message = gaVar.n) == null) {
            Button button = gaVar.o;
            messageObtain = null;
        } else {
            messageObtain = Message.obtain(message);
        }
        if (messageObtain != null) {
            messageObtain.sendToTarget();
        }
        gaVar.G.obtainMessage(1, gaVar.b).sendToTarget();
    }
}
