package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tlx {
    public static final tlx a;
    public static final tlx b;
    public static final tlx c;
    public static final tlx d;
    public static final tlx e;
    public static final tlx f;
    public static final tlx g;
    public static final tlx h;
    public static final tlx i;
    public static final tlx j;
    public static final tlx k;
    public static final tlx l;
    public static final tlx m;
    public static final tlx n;
    public static final tlx o;
    private static final /* synthetic */ tlx[] q;
    public final String p;

    static {
        tlx tlxVar = new tlx("COMPONENT_MATERIALIZATION_COUNTER", 0, "Elements.Perf.ComponentMaterialization");
        a = tlxVar;
        tlx tlxVar2 = new tlx("TEMPLATE_FETCHING_COUNTER", 1, "Elements.Perf.TemplateFetching");
        b = tlxVar2;
        tlx tlxVar3 = new tlx("TEMPLATE_RESOLUTION_COUNTER", 2, "Elements.Perf.TemplateResolution");
        c = tlxVar3;
        tlx tlxVar4 = new tlx("PB_TO_FB_COUNTER", 3, "Elements.Perf.PbToFb");
        d = tlxVar4;
        tlx tlxVar5 = new tlx("FIRST_ROOT_PREPARATION_COUNTER", 4, "Elements.Perf.FirstRootPreparation");
        e = tlxVar5;
        tlx tlxVar6 = new tlx("FIRST_ROOT_MATERIALIZATION_COUNTER", 5, "Elements.Perf.FirstRootMaterialization");
        f = tlxVar6;
        tlx tlxVar7 = new tlx("FIRST_ROOT_MEASUREMENT_COUNTER", 6, "Elements.Perf.FirstRootMeasurement");
        g = tlxVar7;
        tlx tlxVar8 = new tlx("ROOT_MOUNTING_COUNTER", 7, "Elements.Perf.RootMounting");
        h = tlxVar8;
        tlx tlxVar9 = new tlx("COMMAND_EXECUTION_COUNTER", 8, "Elements.Perf.CommandExecution");
        i = tlxVar9;
        tlx tlxVar10 = new tlx("NATIVE_LIBRARY_LOAD_YOGA_COUNTER", 9, "Elements.Perf.NativeLibLoad.Yoga");
        j = tlxVar10;
        tlx tlxVar11 = new tlx("NATIVE_LIBRARY_LOAD_ELEMENTS_COUNTER", 10, "Elements.Perf.NativeLibLoad.Elements");
        k = tlxVar11;
        tlx tlxVar12 = new tlx("NATIVE_LIBRARY_CHECK_YOGA_COUNTER", 11, "Elements.Perf.NativeLibCheck.Yoga");
        l = tlxVar12;
        tlx tlxVar13 = new tlx("NATIVE_LIBRARY_CHECK_ELEMENTS_COUNTER", 12, "Elements.Perf.NativeLibCheck.Elements");
        m = tlxVar13;
        tlx tlxVar14 = new tlx("ELEMENTS_LIFECYCLE_CREATE_DRAW_COUNTER", 13, "Elements.Perf.ElementsLifeCycleCreateDraw");
        n = tlxVar14;
        tlx tlxVar15 = new tlx("ELEMENTS_LIFECYCLE_SET_DRAW_COUNTER", 14, "Elements.Perf.ElementsLifeCycleSetDraw");
        o = tlxVar15;
        tlx[] tlxVarArr = {tlxVar, tlxVar2, tlxVar3, tlxVar4, tlxVar5, tlxVar6, tlxVar7, tlxVar8, tlxVar9, tlxVar10, tlxVar11, tlxVar12, tlxVar13, tlxVar14, tlxVar15};
        q = tlxVarArr;
        agtw.a(tlxVarArr);
    }

    private tlx(String str, int i2, String str2) {
        this.p = str2;
    }

    public static tlx[] values() {
        return (tlx[]) q.clone();
    }
}
