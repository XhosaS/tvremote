package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class iwr implements iwc {
    public static final /* synthetic */ ymp[] a;
    final /* synthetic */ iwu g;
    private final ylr h = new iwi(ivy.a, this);
    public final ylr b = new iwj(ivz.a, this);
    private final ylr i = new iwk(this);
    private final ylr j = new iwl(this);
    private final ylr k = new iwm(false, this);
    public final ylr c = new iwn(this);
    private final ylr l = new iwo(this);
    public final ylr d = new iwp(false, this);
    public final ylr e = new iwq(iwd.a, this);
    private final ylr m = new iwh(0, this);
    public boolean f = true;

    static {
        ykv ykvVar = new ykv(iwr.class, "_connectionState", "get_connectionState()Lcom/google/android/apps/googletv/app/device/virtualremote/VirtualRemote$ConnectionState;", 0);
        int i = ylg.a;
        a = new ymp[]{ykvVar, new ykv(iwr.class, "_connectionType", "get_connectionType()Lcom/google/android/apps/googletv/app/device/virtualremote/VirtualRemote$ConnectionType;", 0), new ykv(iwr.class, "_keyboardInput", "get_keyboardInput()Lcom/google/android/apps/googletv/app/device/virtualremote/VirtualRemote$KeyboardInput;", 0), new ykv(iwr.class, "_isPoweredOn", "get_isPoweredOn()Ljava/lang/Boolean;", 0), new ykv(iwr.class, "_isAudioSessionOpen", "get_isAudioSessionOpen()Z", 0), new ykv(iwr.class, "_volumeLevels", "get_volumeLevels()Lcom/google/android/apps/googletv/app/device/virtualremote/VirtualRemote$VolumeLevels;", 0), new ykv(iwr.class, "_isPaired", "get_isPaired()Ljava/lang/Boolean;", 0), new ykv(iwr.class, "_hasVolumeCapabilities", "get_hasVolumeCapabilities()Z", 0), new ykv(iwr.class, "_voiceCapability", "get_voiceCapability()Lcom/google/android/apps/googletv/app/device/virtualremote/VirtualRemote$VoiceCapability;", 0), new ykv(iwr.class, "_pairingAttempts", "get_pairingAttempts()I", 0)};
    }

    public iwr(iwu iwuVar) {
        this.g = iwuVar;
    }

    @Override // defpackage.iwc
    public final iwa a() {
        return f();
    }

    @Override // defpackage.iwc
    public final Boolean b() {
        return i();
    }

    @Override // defpackage.iwc
    public final boolean c() {
        return r();
    }

    public final int d() {
        return ((Number) this.m.d(a[9])).intValue();
    }

    public final ivy e() {
        return (ivy) this.h.d(a[0]);
    }

    public final iwa f() {
        return (iwa) this.i.d(a[2]);
    }

    public final iwe g() {
        return (iwe) this.c.d(a[5]);
    }

    public final Boolean h() {
        return (Boolean) this.l.d(a[6]);
    }

    public final Boolean i() {
        return (Boolean) this.j.d(a[3]);
    }

    public final void j(ivy ivyVar) {
        ivyVar.getClass();
        this.h.c(a[0], ivyVar);
    }

    public final void k(boolean z) {
        this.k.c(a[4], Boolean.valueOf(z));
    }

    public final void l(Boolean bool) {
        this.l.c(a[6], bool);
    }

    public final void m(Boolean bool) {
        this.j.c(a[3], bool);
    }

    public final void n(iwa iwaVar) {
        this.i.c(a[2], iwaVar);
    }

    public final void o(int i) {
        this.m.c(a[9], Integer.valueOf(i));
    }

    public final void p(yjv yjvVar) {
        this.f = false;
        yjvVar.a(this);
        this.f = true;
        this.g.l();
    }

    public final boolean q() {
        return ((Boolean) this.d.d(a[7])).booleanValue();
    }

    public final boolean r() {
        return ((Boolean) this.k.d(a[4])).booleanValue();
    }
}
