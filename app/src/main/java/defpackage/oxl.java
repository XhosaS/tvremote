package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class oxl {
    public static final oxl a;
    public static final oxl b;
    public static final oxl c;
    public static final oxl d;
    public static final oxl e;
    public static final oxl f;
    public static final oxl g;
    public static final oxl h;
    public static final oxl i;
    public static final oxl j;
    public static final oxl k;
    public static final oxl l;
    public static final oxl m;
    public static final oxl n;
    public static final oxl o;
    public static final oxl p;
    public static final oxl q;
    public static final oxl r;
    public static final oxl s;
    public static final oxl t;
    private static final /* synthetic */ oxl[] v;
    public final String u;

    static {
        oxl oxlVar = new oxl("ADD_DEVICE", 0, "device.create");
        a = oxlVar;
        oxl oxlVar2 = new oxl("UPDATE_HOUSEHOLD_MEMBERSHIP", 1, "structure.update.membership");
        b = oxlVar2;
        oxl oxlVar3 = new oxl("UPDATE_ADDRESS", 2, "structure.update.address");
        c = oxlVar3;
        oxl oxlVar4 = new oxl("CREATE_ROUTINES", 3, "routine.create");
        d = oxlVar4;
        oxl oxlVar5 = new oxl("READ_ROUTINES", 4, "routine.read");
        e = oxlVar5;
        oxl oxlVar6 = new oxl("EXECUTE_AUTOMATIONS", 5, "routine.execute");
        f = oxlVar6;
        oxl oxlVar7 = new oxl("READ_FEED", 6, "structure.read.feed");
        g = oxlVar7;
        oxl oxlVar8 = new oxl("READ_ACTIVITY", 7, "structure.read.activity_feed");
        h = oxlVar8;
        oxl oxlVar9 = new oxl("ACCESS_TO_SDM", 8, "structure.read.sdm_resourcepicker");
        i = oxlVar9;
        oxl oxlVar10 = new oxl("UPDATE_ROOM", 9, "room.update");
        j = oxlVar10;
        oxl oxlVar11 = new oxl("UPDATE_WIFI_SETTINGS", 10, "network.update.networksettings");
        k = oxlVar11;
        oxl oxlVar12 = new oxl("READ_WIFI_NETWORK_STATE", 11, "network.read.networkstate");
        l = oxlVar12;
        oxl oxlVar13 = new oxl("MANAGE_FAMILY_WIFI", 12, "network.update.familywifi");
        m = oxlVar13;
        oxl oxlVar14 = new oxl("UPDATE_NEST_AWARE_SUBSCRIPTION", 13, "structure.update.subscription_nestaware");
        n = oxlVar14;
        oxl oxlVar15 = new oxl("UPDATE_CAMERA_SETTINGS", 14, "device.update.camera_settings");
        o = oxlVar15;
        oxl oxlVar16 = new oxl("UPDATE_DEVICE_SETTINGS", 15, "device.update.settings");
        p = oxlVar16;
        oxl oxlVar17 = new oxl("UPDATE_STRUCTURE", 16, "structure.update");
        q = oxlVar17;
        oxl oxlVar18 = new oxl("DEVICE_READ_CAMERA_FF_SETTING", 17, "device.read.camera_familiarfacesettings");
        r = oxlVar18;
        oxl oxlVar19 = new oxl("CREATE_GROUP", 18, "group.create");
        s = oxlVar19;
        oxl oxlVar20 = new oxl("UPDATE_PRESENCE", 19, "structure.update.presence");
        t = oxlVar20;
        oxl[] oxlVarArr = {oxlVar, oxlVar2, oxlVar3, oxlVar4, oxlVar5, oxlVar6, oxlVar7, oxlVar8, oxlVar9, oxlVar10, oxlVar11, oxlVar12, oxlVar13, oxlVar14, oxlVar15, oxlVar16, oxlVar17, oxlVar18, oxlVar19, oxlVar20};
        v = oxlVarArr;
        agtw.a(oxlVarArr);
    }

    private oxl(String str, int i2, String str2) {
        this.u = str2;
    }

    public static oxl[] values() {
        return (oxl[]) v.clone();
    }
}
