package MurkyConspiracy.mod.objects.items;

import MurkyConspiracy.mod.Main;
import MurkyConspiracy.mod.init.BlockInit;
import MurkyConspiracy.mod.init.ItemInit;
import MurkyConspiracy.mod.util.interfaces.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;


public class NuggetBase extends Item implements IHasModel
{
	
	public NuggetBase(String name, Boolean hasIngot)
	{
		String nuggetName = "nugget_" + name;
		
		Item newNugget = new Item();
		newNugget.setUnlocalizedName(nuggetName);
		newNugget.setRegistryName(nuggetName);
		newNugget.setCreativeTab(Main.theblockcomplextab);
		
		ItemInit.ITEMS.add(newNugget);
		
		if(hasIngot)
		{
			String ingotName = "ingot_" + name;
			
			Item newIngot = new Item();
			newIngot.setUnlocalizedName(ingotName);
			newIngot.setRegistryName(ingotName);
			newIngot.setCreativeTab(Main.theblockcomplextab);
			
			ItemInit.ITEMS.add(newIngot);
		}
		
	}
	
	public NuggetBase(String name, Boolean hasIngot, Material material)
	{
		
		String nuggetName = "nugget_" + name;
		String blockName = "block_" + name;
		
		Item newNugget = new Item();
		newNugget.setUnlocalizedName(nuggetName);
		newNugget.setRegistryName(nuggetName);
		newNugget.setCreativeTab(Main.theblockcomplextab);
		
		ItemInit.ITEMS.add(newNugget);
		
		if(hasIngot)
		{
			String ingotName = "ingot_" + name;
			
			Item newIngot = new Item();
			newIngot.setUnlocalizedName(ingotName);
			newIngot.setRegistryName(ingotName);
			newIngot.setCreativeTab(Main.theblockcomplextab);
			
			ItemInit.ITEMS.add(newIngot);
		}
		
		Block newBlock = new Block(material);
		newBlock.setUnlocalizedName(blockName);
		newBlock.setRegistryName(blockName);
		newBlock.setCreativeTab(Main.theblockcomplextab);
		
		BlockInit.BLOCKS.add(newBlock);
		ItemInit.ITEMS.add(new ItemBlock(newBlock).setRegistryName(newBlock.getRegistryName()));
		
	}
	
	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
}