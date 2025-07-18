package defpackage;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ds extends Activity implements dvk, cvc {
    private final ko<Class<? extends dr>, dr> extraDataMap = new ko<>((byte[]) null);
    private final dvl lifecycleRegistry = new dvl(this);

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private final boolean shouldSkipDump(String[] strArr) {
        if (strArr != null && strArr.length != 0) {
            String str = strArr[0];
            int i = 33;
            switch (str.hashCode()) {
                case -645125871:
                    if (str.equals("--translation")) {
                        i = 31;
                        break;
                    }
                    break;
                case 100470631:
                    if (str.equals("--dump-dumpable")) {
                    }
                    break;
                case 472614934:
                    if (str.equals("--list-dumpables")) {
                    }
                    break;
                case 1159329357:
                    if (str.equals("--contentcapture")) {
                        i = 29;
                        break;
                    }
                    break;
                case 1455016274:
                    if (str.equals("--autofill")) {
                        i = 26;
                        break;
                    }
                    break;
            }
            if (Build.VERSION.SDK_INT >= i) {
                return true;
            }
        }
        return false;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        keyEvent.getClass();
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        if (cww.v(decorView, keyEvent)) {
            return true;
        }
        return cvd.a(this, decorView, this, keyEvent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        keyEvent.getClass();
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        if (cww.v(decorView, keyEvent)) {
            return true;
        }
        return super.dispatchKeyShortcutEvent(keyEvent);
    }

    @yfp
    public <T extends dr> T getExtraData(Class<T> cls) {
        cls.getClass();
        return (T) this.extraDataMap.get(cls);
    }

    @Override // defpackage.dvk
    public dve getLifecycle() {
        return this.lifecycleRegistry;
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i = dwh.b;
        dvb.f(this);
    }

    @Override // android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        this.lifecycleRegistry.f(dvd.c);
        super.onSaveInstanceState(bundle);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @yfp
    public void putExtraData(dr drVar) {
        drVar.getClass();
        this.extraDataMap.put(drVar.getClass(), drVar);
    }

    protected final boolean shouldDumpInternalState(String[] strArr) {
        return !shouldSkipDump(strArr);
    }

    @Override // defpackage.cvc
    public boolean superDispatchKeyEvent(KeyEvent keyEvent) {
        keyEvent.getClass();
        return super.dispatchKeyEvent(keyEvent);
    }

    private static /* synthetic */ void getExtraDataMap$annotations() {
    }

    private static /* synthetic */ void getLifecycleRegistry$annotations() {
    }
}
