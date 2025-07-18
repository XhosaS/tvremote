package defpackage;

import android.hardware.input.InputManager;
import android.os.Handler;
import android.view.InputDevice;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bor implements InputManager.InputDeviceListener {
    final /* synthetic */ InputManager a;
    final /* synthetic */ Handler b;
    final /* synthetic */ Consumer c;
    final /* synthetic */ bou d;

    public bor(bou bouVar, InputManager inputManager, Handler handler, Consumer consumer) {
        this.a = inputManager;
        this.b = handler;
        this.c = consumer;
        this.d = bouVar;
    }

    @Override // android.hardware.input.InputManager.InputDeviceListener
    public final void onInputDeviceAdded(int i) {
        InputManager inputManager = this.a;
        InputDevice inputDevice = inputManager.getInputDevice(i);
        if (inputDevice == null) {
            ((cbs) bou.a.g().j("com/google/android/tv/remote/service/KeyboardFeature$1", "onInputDeviceAdded", 76, "KeyboardFeature.java")).r("The input device %d was added and then immediately removed", i);
            return;
        }
        ((cbs) ((cbs) bou.a.e().g(btt.a)).j("com/google/android/tv/remote/service/KeyboardFeature$1", "onInputDeviceAdded", 83, "KeyboardFeature.java")).y("Input device %s(%d) is registered", inputDevice.getName(), inputDevice.getId());
        if (inputDevice.getName().equals("virtual-remote")) {
            inputManager.unregisterInputDeviceListener(this);
            this.b.removeCallbacksAndMessages(null);
            boolean[] zArrHasKeys = inputDevice.hasKeys(26);
            bou bouVar = this.d;
            bouVar.d = Boolean.valueOf(!zArrHasKeys[0]);
            this.c.accept(bouVar.d);
        }
    }

    @Override // android.hardware.input.InputManager.InputDeviceListener
    public final void onInputDeviceChanged(int i) {
    }

    @Override // android.hardware.input.InputManager.InputDeviceListener
    public final void onInputDeviceRemoved(int i) {
    }
}
