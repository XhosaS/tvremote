package defpackage;

import android.bluetooth.BluetoothDevice;
import android.net.Uri;
import android.text.TextUtils;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tkj extends tkm {
    final BluetoothDevice a;
    final String b;

    public tkj(BluetoothDevice bluetoothDevice) {
        String name = bluetoothDevice.getName();
        this.a = bluetoothDevice;
        this.b = name;
    }

    @Override // defpackage.tkm
    public final Uri a() {
        return new Uri.Builder().scheme("bt").encodedAuthority(this.a.getAddress()).fragment(b().toString()).build();
    }

    @Override // defpackage.tkm
    public final CharSequence b() {
        tkm tkmVar = this.c;
        if (tkmVar != null) {
            return tkmVar.b();
        }
        String str = this.b;
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        BluetoothDevice bluetoothDevice = this.a;
        String name = bluetoothDevice.getName();
        return !TextUtils.isEmpty(name) ? name : bluetoothDevice.getAddress();
    }

    @Override // defpackage.tkm
    public final String c() {
        return new Uri.Builder().scheme("bt").encodedAuthority(this.a.getAddress()).build().toString();
    }

    @Override // defpackage.tkm
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        if (this == obj || ((obj instanceof tkm) && Objects.equals(a(), ((tkm) obj).a()))) {
            return this.a.equals(((tkj) obj).a);
        }
        return false;
    }

    @Override // defpackage.tkm
    public final int hashCode() {
        return (Objects.hashCode(a()) * 31) + this.a.hashCode();
    }
}
