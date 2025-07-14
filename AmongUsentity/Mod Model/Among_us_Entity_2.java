// Made with Blockbench 4.12.1
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


public class Among_us_Entity_Template<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "among_us_entity_template"), "main");
	private final ModelPart model;
	private final ModelPart back;
	private final ModelPart body;
	private final ModelPart left_Leg;
	private final ModelPart right_leg;
	private final ModelPart face;

	public Among_us_Entity_Template(ModelPart root) {
		this.model = root.getChild("model");
		this.back = this.model.getChild("back");
		this.body = this.model.getChild("body");
		this.left_Leg = this.model.getChild("left_Leg");
		this.right_leg = this.model.getChild("right_leg");
		this.face = this.model.getChild("face");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition model = partdefinition.addOrReplaceChild("model", CubeListBuilder.create(), PartPose.offset(3.0F, 24.0F, 0.0F));

		PartDefinition back = model.addOrReplaceChild("back", CubeListBuilder.create().texOffs(0, 12).addBox(-7.0F, -5.0F, -1.0F, 7.0F, 8.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -9.0F, 3.0F));

		PartDefinition body = model.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 0).addBox(-5.0F, -15.0F, -1.0F, 9.0F, 9.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(-3.0F, 0.0F, 0.0F));

		PartDefinition left_Leg = model.addOrReplaceChild("left_Leg", CubeListBuilder.create().texOffs(0, 23).addBox(-2.0F, -3.0F, -1.0F, 3.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(-6.0F, -3.0F, 0.0F));

		PartDefinition right_leg = model.addOrReplaceChild("right_leg", CubeListBuilder.create().texOffs(0, 23).addBox(1.0F, -6.0F, -1.0F, 3.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(-3.0F, 0.0F, 0.0F));

		PartDefinition face = model.addOrReplaceChild("face", CubeListBuilder.create().texOffs(21, 13).addBox(-5.0F, -2.0F, -1.0F, 9.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-3.0F, -11.0F, -2.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		model.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}