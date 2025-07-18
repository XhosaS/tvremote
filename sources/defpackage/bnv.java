package defpackage;

import android.view.inputmethod.InputConnection;
import com.google.android.tv.remote.service.ImeBridgeService;
import java.util.ArrayDeque;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bnv implements boa {
    final /* synthetic */ boolean a;
    final /* synthetic */ InputConnection b;
    final /* synthetic */ ImeBridgeService c;

    public bnv(ImeBridgeService imeBridgeService, boolean z, InputConnection inputConnection) {
        this.a = z;
        this.b = inputConnection;
        this.c = imeBridgeService;
    }

    @Override // defpackage.boa
    public final void a() {
        if (this.a) {
            this.b.endBatchEdit();
        }
    }

    @Override // defpackage.boa
    public final void b(int i) {
        if (this.a) {
            this.b.performEditorAction(i);
        }
    }

    @Override // defpackage.boa
    public final void c(int i, int i2, String str) {
        Object obj;
        if (this.a) {
            ArrayDeque arrayDeque = (ArrayDeque) this.c.c.b;
            kx kxVar = (kx) arrayDeque.peekLast();
            if (kxVar != null && (obj = kxVar.c) != null) {
                String str2 = (String) obj;
                int length = i > str2.length() ? str2.length() : i;
                int length2 = i2 > str2.length() ? str2.length() : i2;
                int length3 = str.length() + length;
                arrayDeque.add(new kx(length3, length3, str2.substring(0, length) + str + str2.substring(length2)));
            }
            InputConnection inputConnection = this.b;
            inputConnection.setComposingRegion(i, i2);
            inputConnection.commitText(str, 1);
        }
    }

    @Override // defpackage.boa
    public final void d(int i, int i2) {
        if (this.a) {
            ArrayDeque arrayDeque = (ArrayDeque) this.c.c.b;
            kx kxVar = (kx) arrayDeque.peekLast();
            if (kxVar != null) {
                arrayDeque.add(new kx(i, i2, kxVar.c));
            }
            this.b.setSelection(i, i2);
        }
    }
}
